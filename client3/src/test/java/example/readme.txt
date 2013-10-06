Result type:
        country
        postal_code
        locality
        point_of_interest
        street_address
        route
Status:
        OK
        ZERO_RESULTS
Result Accuracy:
        APPROXIMATE
        ROOFTOP

latitude,longitude,address,city,state,zip,country
//必须的
private String latitude;
private String longitude;
private String address;
private String city;
private String state;
private String zip;
private String country;

//返回的
response.getLongitude() = -73.9457999
response.getLatitude() = 40.7752104
response.getResultAccuracy() = APPROXIMATE
response.getResultType() = point_of_interest
response.getStatus() = OK

//表
if OBJECT_ID('GeoCoderMonitor','u') is not null
	print 'drop table geo coder monitor'
	drop table dbo.GeoCoderMonitor
go

create table GeoCoderMonitor(
MonitorID int primary key identity(0,1),
CreateOn [datetime] not null,
Requests int not null
)
go


insert into GeoCoderMonitor values(GETDATE(),100);
insert into GeoCoderMonitor values(GETDATE(),99);
insert into GeoCoderMonitor values(GETDATE(),50);
insert into GeoCoderMonitor values(GETDATE(),54);
insert into GeoCoderMonitor values(GETDATE(),52);
insert into GeoCoderMonitor values(GETDATE(),15);


select * from GeoCoderMonitor

