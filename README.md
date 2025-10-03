# AirlineIndustry202
## UML Diagram
<img width="1271" height="1027" alt="image" src="https://github.com/user-attachments/assets/7de3baa3-a5d8-4a92-a13a-fad0d346d73d" />

I'm unable to draw the relationship shapes in the above using lucid charts, please consider the below with explanation:
	1.	Airline → Flight - Aggregation (hollow diamond) - An Airline operates many Flights. Flights can exist independently but are grouped under an airline.
	2.	Flight → Airport - Association (simple line) - A Flight departs from one Airport and arrives at another Airport.
	3.	Flight → Airplane - Association (simple line) - A Flight uses an Airplane for operation.
	4.	Flight → Pilot - Association (simple line) - A Flight is assigned to a Pilot.
	5.	Airplane → Seat - Composition (filled diamond) - An Airplane contains Seats. If the Airplane is deleted, its Seats cannot exist independently.
	6.	Passenger → Ticket - Aggregation (hollow diamond) - A Passenger books one or more Tickets, but the Tickets can still exist independently of the Passenger.
	7.	Flight → Ticket - Aggregation (hollow diamond) - A Flight issues Tickets. Tickets are tied to flights but not destroyed if the flight object is removed from the model.
	8.	Ticket → Seat - Association (simple line) - A Ticket reserves a Seat for a Passenger on a specific Flight.

Link to the above diagram - https://lucid.app/lucidchart/79921829-3072-4a9b-ad2b-c9bb4fa16dbb/edit?viewport_loc=-2684%2C-1138%2C6366%2C2444%2CHWEp-vi-RSFO&invitationId=inv_b7554b03-f3d4-4855-a2e1-559d617d0ec7
