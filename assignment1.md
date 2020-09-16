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

* Data: emailAddress, Password, Grades
* Behaviors: login, joinCourse, submitAssignments, resubmitAssignments, checkGrades, downloadFiles, checkNotifications, dismissAlert

- ManagerUsers

* Data: emailAddress, Password
* Behaviors: login, addCourse, cancelCourse, addAssignments, uploadGrades, changeGrades, addFiles

- System

* Data: Dashboard, Calendar, Notifications
* Behaviors: showList, showCourseInCalendar, addDeadlineToCalendar, sendNotifications

- Dashboard

* Data: Course, Alert
* Behaviors: showCourse, sendAlert

- Course

* Data: courseName, courseTime, Summary, Assignments, assignmentDeadline, Announcements, Grades, People, Files
* Behaviors: 

### Sequence of invoking behaviors on objects

> StudentUsers ruby;
* ManagerUsers siva;
* siva.login(emailAddress, Password);
* Course info5100 = siva.addCourse(courseName, courseTime, Summary, Announcements, Grades, People, Files);
* System canvas;
* canvas.showList(Dashboard, Calendar, Notifications);
* Dashboard dashboard = siva.addCourse(info5100.courseName);
* if info5100 isEstablish
>>> ruby.login(emailAddress, Password);
* ruby.joinCourse(info5100);
* canvas.showCourseInCalendar(info5100.courseName, info5100.courseTime);
* dashborad.showCourse(info5100);
* if Notifications shouldBeSent
>>>>> canvas.sendNotifications(Notifications);
* ruby.checkNotifications(canvas.Notifications);
* if course isFinished
*       siva.addFiles(info5100.Files);
*       ruby.downloadFiles(info5100.Files);
*       siva.addAssignments(info5100.Assignments, info5100.assignmentDeadline);
*       canvas.addDeadlineToCalendar(info5100.assignmentDeadline);
*       if Assignments isFinished 
*         ruby.submitAssignments(info5100.Assignments);
*       else if Assignments isModified
*         ruby.resubmitAssignments(info5100.Assignments);
*       else
*         dashboard.sendAlert(info5100.assignmentDeadline);
*         ruby.dismissAlert(info5100.assignmentDeadline);
*         if Assignments isDue
*           siva.uploadGrades(ruby.Grades);
*           ruby.checkGrades(ruby.Grades);
*             if Grades isWrong
*               siva.changeGrades(ruby.Grades);
* else
  * siva.cancelCourse(info5100);  

## Design a pet adoption platform

### Sequence of invoking behaviors on objects

## Design an app to book airline ticket

### Sequence of invoking behaviors on objects

## Design a course registration platform

### Sequence of invoking behaviors on objects

## Order food in a food delivery app (Like Uber Eats)

### Sequence of invoking behaviors on objects
