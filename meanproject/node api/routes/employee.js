const express = require('express');

const router = express.Router();
const Employee=require('../models/employee')

router.get('/',(req,res)=>{
    res.status(200).json({
        error: false,
        message: 'get all employees'
    });
});

router.post('/:id',async (req,res)=>{
    const employee = await Employee.findByIdAndUpdate(req.params.id,req.body, {
        new: true,
        runValidators: true
    })
    if(!employee){
        res.status(404).json({
            error: true,
            message: "employee id does not exist"
        })
    }

    try{
        res.status(201).json({
            error: false,
            date: doc
        })
    }catch(err){
        res.status(400).json({
            error: true,
            message: err.message

        })
    }
})
router.get('/:id', async(req,res)=>{
    const employee = await Employee.findById(req.params.id,req.body, {
        new: true,
        runValidators: true
    })
    if(!employee){
        res.status(404).json({
            error: true,
            message: "employee id does not exist"
        })
    }

    try{
        res.status(201).json({
            error: false,
            data: emloyees
        })
    }catch(err){
        res.status(400).json({
            error: true,
            message: err.message

        })
    }  
})
router.delete('/:id',async (req,res)=>{
    const employee = await Employee.findByIdAndDelete(req.params.id,req.body, {
        new: true,
        runValidators: true
    })
    if(!employee){
        res.status(404).json({
            error: true,
            message: "employee id does not exist"
        })
    }

    try{
        res.status(201).json({
            error: false,
            date: doc
        })
    }catch(err){
        res.status(400).json({
            error: true,
            message: err.message

        })
    }
})
router.post('/',(req,res)=>{
    res.status(201).json({
        error: false,
        message: 'create new employee'
    });
});

router.put('/',(req,res)=>{
    res.status(200).json({
        error: false,
        message: 'update employee'
    });
});

router.delete('/',(req,res)=>{
    res.status(200).json({
        error: false,
        message: 'delete employee'
    });
});
module.exports = router;