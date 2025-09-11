# Write your MySQL query statement below
SELECT user_id, COUNT(DISTINCT follower_id) AS followers_count
FROM Followers
-- ORDER BY user_id ASC
GROUP BY user_id;