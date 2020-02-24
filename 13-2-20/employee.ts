export class Employee{

    constructor(
        public firstName: String,
        public lastName: String,
        public salary: Number,
        public gender: String,
        public email: String){

    }

    getFullName(){
        console.log(this.firstName + " "+this.lastName)
    }

}

let emp = new Employee("mark","smith", 1000, "male", "m@gmail.com");
emp.getFullName();

