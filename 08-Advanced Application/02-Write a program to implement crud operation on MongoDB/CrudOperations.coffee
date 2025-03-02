Show dbs

Use RDJ

db.createCollection("SYCS")

db.sycs.insertOne({name:"Tony",age:"20",gender:"Male",address:"Nagpada"})

db.sycs.insertMany([{name:"Hulk",age:"25",gender:"Male",address:"Titwala"},
{name:"Hawkeye",age:"20",gender:"Male",address:"Dehli"},
{name: "Wanda",age:"18",gender:"Female",address:"Mumbai"}])

db.sycs.find({"age":"20"}) 

db.sycs.replaceOne({name:"Hulk"},{name:"Wanda"}) 

db.sycs.updateOne({name:"Hulk"},{$set:{address:"Mumbra"}}) 

db.sycs.deleteOne({name:"Hawkeye"}) 

db.sycs.deleteMany({gender:"female"})

db.dropDatabase()