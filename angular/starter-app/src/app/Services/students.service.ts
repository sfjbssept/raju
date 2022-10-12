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

  constructor(public http:HttpClient) { }
}
