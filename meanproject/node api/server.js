const express=require('express');
const employeeRoutes = require('./routes/employee');
const morgan = require('morgan')
const app = express();
const mongoose=require('mongoose')

mongoose.connect('mongodb://localhost:27017/employeeDB',
{
    useNewUrlParser: true,
    useUnifiedTopology: true
},
err =>{
    if(err){
        console.log('mongodb could not connect');
    }else{
        console.log('monogodb connectd');
    }
}
);

app.get('/',(req,res)=>{
    res.status(200).json({
        error: false,
        message: 'api is up and running'
    })
})
app.use(morgan('dev'));
app.use('/api/v1/employee', employeeRoutes);


const PORT = process.env.PORT || 5000;

app.listen(PORT, () => {
    console.log(`server is running at PORT :${PORT}`)
});