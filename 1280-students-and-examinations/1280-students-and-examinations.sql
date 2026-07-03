SELECT
t.student_id,t.student_name,t.subject_name,COUNT(e.student_id)
AS
attended_exams
FROM
Examinations e
RIGHT JOIN
(SELECT * FROM Students s JOIN Subjects)t
ON
e.student_id=t.student_id
AND
e.subject_name=t.subject_name
GROUP BY
t.student_id,t.student_name,t.subject_name
ORDER BY
t.student_id,t.subject_name;
