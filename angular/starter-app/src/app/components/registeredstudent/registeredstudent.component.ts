import { Component, OnInit } from '@angular/core';
import { StudentsService } from 'src/app/Services/students.service';
import Student from 'src/app/entity/student';

@Component({
  selector: 'app-registeredstudent',
  templateUrl: './registeredstudent.component.html',
  styleUrls: ['./registeredstudent.component.css']
})
export class RegisteredstudentComponent implements OnInit {


  students:Student[]=[];

  deleteStudent(student ,index){
  const observable=this.studentService.deleteStudent(student);
  observable.subscribe((responce:any)=>{
  console.log(responce)
  this.students.slice(index,1)
  });
  }

  constructor(public studentService: StudentsService) { }

  ngOnInit(): void {
    const promise=this.studentService.getStudent();
    promise.subscribe((responce)=>{
    console.log(responce);
    this.students = responce as Student[];
    });
  }

}
