import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
const BASE_URL="http://localhost:5000/students"

@Injectable({
  providedIn: 'root'
})
export class StudentsService {

  createStudent(student:{firstName:string,lastName:string,age:number,class:number,subject:string}){
    return this.http.post(BASE_URL,student);
  }

  getStudent(){
    return this.http.get(BASE_URL);
  }

  deleteStudent(student:any){
   return this.http.delete(BASE_URL+"/"+student.id)
  }
  constructor(public http:HttpClient) { }
}
