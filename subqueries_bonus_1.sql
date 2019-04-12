-- NOTE: This code will not currently run, as is.
-- The Employees database needs to be downloaded and installed first.
SELECT d.dept_name
FROM employees as e
       JOIN dept_manager dm on e.emp_no = dm.emp_no
       JOIN departments d on dm.dept_no = d.dept_no
WHERE gender = 'F'
  AND e.emp_no IN (
  SELECT e.emp_no
  FROM dept_manager
)
  AND dm.to_date LIKE '9999-01-01'
ORDER BY d.dept_name;