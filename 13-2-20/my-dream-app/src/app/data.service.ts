import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";
import {IEmployee } from'./employee';


@Injectable()
export class DataService {
  constructor(private http: HttpClient) { }

  configUrl = 'jsonplaceholder.typicode.com/posts';

getEmployees():Observable<IEmployee[]> {
  return this.http.get<IEmployee[]>(this.configUrl);
}
}


