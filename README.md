# sbt-flyway
using flyway SBT plugin to migrate a postgresql database

create the role owner and database *flywayexample* in postgresql databse

```
./createUserAndDatabse.sh
```

migrate using

``` 
sbt flywayMigrate
```
and for migration info use

``` 
flywayInfo
```
