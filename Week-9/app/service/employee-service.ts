import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  
  
 
  private apiUrl = 'http://localhost:9090/user'; // Replace with your backend API URL

  constructor(private http: HttpClient) {}

  public addEmployee(employee: any): Observable<any> {
    return this.http.post(this.apiUrl + '/add', employee);
  }
  public getEmployees(): Observable<any> {
    return this.http.get(this.apiUrl + '/list');
  }
  public getEmployee(id: any): Observable<any> {
    return this.http.get(this.apiUrl + `/${id}`);
  }
  updateEmployee(id: any, updateData: any) {
    return this.http.put(this.apiUrl + `/update/${id}`, updateData);
  }
  deleteEmployee(id: number){
    return this.http.delete(this.apiUrl + `/delete/${id}`);
  }
}
