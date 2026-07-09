-- Last updated: 7/9/2026, 3:15:12 PM
SELECT * FROM Cinema WHERE MOD(id,2) =1 AND
description <> 'boring' ORDER BY rating DESC