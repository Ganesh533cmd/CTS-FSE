import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class DataService {
  constructor(private http: HttpClient) { }

  configUrl = 'jsonplaceholder.typicode.com/posts';

getEmployees() {
  return this.http.get(this.configUrl);
}
}


