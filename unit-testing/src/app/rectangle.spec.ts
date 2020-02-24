import {Rectangle}from './rectangle';
describe('testing calculator class',function(){
    it('test area function',function(){
        let rec=new Rectangle();
        let actualResult=rec.getArea(1,20)
        let expectedResult=20;
        expect(actualResult).toBe(expectedResult)
    })
it('test parameter number',function(){
let rec=new Rectangle();
let actualResult=rec.getParameter(2,10)
expect(actualResult).toBe(24)
})
})
