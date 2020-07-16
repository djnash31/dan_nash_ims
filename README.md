Coverage: 34%
IMS project

An IMS using Java, SQL and GCP to host it this will allow a user to input details of a customer, items and an order table which will allow ease of management across the business that it is being used in. This will allow a business to control what items go where and see what orders take place within a certain period and allows them to update their stocks list.

## Getting Started

You will need to connect to GCP which allows you to view the results and to be able to get them results you need to use Java to be able to create the using the Eclipse IDE this will allow you to be able connect to the SQL instance on the Java using the IP and changing the IP on the GCP instance so anything can connect if it has the right IP address for it.
### Prerequisites

You will need Eclipse as an IDE, Java as the language, Maven for testing, SQL to store your data and then you need a GCP account for the storing of data on the cloud.
TO install Eclipse you need to download teh .exe file and then run it and install the one for entreprise and developers when you get to that stage, to download Java you need to download the zip file for the JDK off the Oracle website and then you need to configure it within the environment system files and the same is to be done with maven. TO download MySQL you need to download the .exe file and the install it using that. For GCP you need an account and to make an instance on the SQL section of their page.

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be
You will need to be on the Eclipse IDE and then you will need to be able to connect to your GCP instance and then run the program to enter the data of whatever you want e.g the customer which will store it on GCP

And repeat until you have added all the information you want.



## Running the tests

These tests allow me to chekc everything is doing what it should be, such as updating an item within the table. This will allow you to be able to get right results everytime and since the code is based off the tests it will be very easy to see what works and what doesn't.

### Unit Tests 

They test the Daos for all the tables, it test teh services and the IMS which ensures it runs properly to be bale to connect with everything.


### Integration Tests 
These are done for GCP and how I will implement them onto a live server which will let me see how compatible it is with different pieces of the cloud and which information is stored where.

### And coding style tests

Explain what these tests test and why
To ensure that I am not repeatin any bits of code within the program this will allow it to run slightly faster and take less time to compile.

## Deployment

We can deploy this within a live system by using the cloud to host also to store the data there as well as it will need to be accessed by many other people this will allow a code standard and speed.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Nick Johnson** - *Refinements* - [nickrstewarttds](https://github.com/nickrstewarttds)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat-tip to anyone whose code was used
* Shout-out to anyone who helped you out
* Inspiration
* etc.
