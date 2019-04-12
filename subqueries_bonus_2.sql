-- NOTE: This code will not currently run, as is.
-- The Employees database needs to be downloaded and installed first.
SELECT first_name, last_name
FROM employees
WHERE emp_no IN (
  SELECT emp_no
  FROM salaries
  WHERE salary IN (
    (SELECT MAX(salary)
     FROM salaries)
  )
);


-- Alternate solution
SELECT e.first_name, e.last_name
FROM employees AS e
       JOIN salaries s on e.emp_no = s.emp_no
WHERE s.salary IN (
  SELECT MAX(salary)
  FROM salaries);