# Assignment 1

Questions:
Given a few circumstances, try to think in objects and design the objects and behaviors for each question. Use the pseudo code to describe a certain sequence of invoking behaviors and objects. Try to think as much details as you can and come up with the solution independently.

1.Design a course management system (Like Canvas);

2.Design a pet adoption platform;

3.Design an app to book airline ticket;

4.Design a course registration platform;

5.Order food in a food delivery app (Like Uber Eats).

## Design a course management system (Like Canvas)

- StudentUsers

Data: emailAddress, Password
Behaviors: logIn, Search, submitAssignments, resubmitAssignments, checkGrades, downloadFiles, checkNotifications, dismissAlert,

- ManagerUsers

Data: emailAddress, Password
Behaviors: addSummary, deleteSummary, addAssignments, deleteAssignments, addAnnouncements, deleteAnnouncements, uploadGrades, changeGrades, addPeople, deletePeople, addFiles, deleteFiles

- System

Data: Dashboard, Calendar, Notifications
Behaviors: showCourseInCalendar, addDeadlineToCalendar, receiveNotifications

- Dashboard

Data: Course, Alert
Behaviors: addCourse, cancelCourse, sendAlert

- Course

Data: Summary, Assignments, Announcements, Grades, People, Files
Behaviors: 

### Sequence of invoking behaviors on objects

StudentUsers Ruby;


## Design a pet adoption platform

### Sequence of invoking behaviors on objects

## Design an app to book airline ticket

### Sequence of invoking behaviors on objects

## Design a course registration platform

### Sequence of invoking behaviors on objects

## Order food in a food delivery app (Like Uber Eats)

### Sequence of invoking behaviors on objects
