import { Component, OnInit ,Output,EventEmitter} from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styles: [
    `
    `
  ]
})
export class TestComponent implements OnInit {

  names = ["Mark", "Smith", "Paul", "Watson"]

  employees = [];

  constructor() {
    this.employees = [
      {"empId":"1", "empName": "Mark", "age": 20,"salary":5000 },
      {"empId":"2", "empName": "Paul", "age": 30, "salary":7000 },
      {"empId":"3", "empName": "Watson", "age": 40, "salary":9000 },
      {"empId":"4", "empName": "Stacy", "age": 60, "salary":4125 }
    ]
   }

   onButtonClicked(){
    this.employees = [
      {"empId":"1", "empName": "Mark", "age": 20 },
      {"empId":"2", "empName": "Paul", "age": 30 },
      {"empId":"3", "empName": "Watson", "age": 40 },
      {"empId":"4", "empName": "Stacy", "age": 60 },
      {"empId":"5", "empName": "Stone", "age": 60 }
    ]
   }

   trackByEmpId(employee, index){
     return employee.empId
   }

   onDelete(employee){
     console.log(employee);
     
   }

  ngOnInit(): void {

  }
  @Output()
  public childEvent = new EventEmitter()

 
}