import { Component, OnInit } from '@angular/core';
import { employeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  constructor(private employeeService: employeeService) { }

  ngOnInit(): void {
  }

}
