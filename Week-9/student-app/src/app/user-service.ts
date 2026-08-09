import { HttpClient } from '@angular/common/http';
import { Injectable, Service } from '@angular/core';

@Injectable({providedIn:'root'})
export class UserService {
   
    private apiUrl="http://localhost:8080/student";
    constructor(private http: HttpClient) {}
    public addStudent(student: any) {
        
        return this.http.post(this.apiUrl+'/add', student);
    }
    public getStudents(){
        return this.http.get(this.apiUrl+'/list');
    }
    public  deleteStudent(id: number) {
      throw this.http.delete(this.apiUrl+'/byId/${id}');
    }
    public getStudent(id:any){
        return this,this.http.get(this.apiUrl+'/byId/'+id);
    }
    public updateStudent(id: number, userData: any) {
        return this.http.put(this.apiUrl + `/update/${id}`,userData);
}
}
