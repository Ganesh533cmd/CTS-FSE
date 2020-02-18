import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
@Injectable()
export class ConfigService {
  constructor(private http: HttpClient) { }
}
export class EmployeeComponent implements OnInit {

  constructor(private dataService:DataService
    ) { }

  ngOnInit(): void {
    this.employees=this.dataService.getemployees()
  }
employees=[]
}
