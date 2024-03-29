DROP TABLE IF EXISTS establishment_review;

CREATE TABLE establishment_review (
  ID LONG PRIMARY KEY,
  AVERAGE_REVIEW_SCORE double DEFAULT NULL,
  NUMBEROF_REVIEWS INT DEFAULT NULL
);
 
INSERT INTO establishment_review (ID, AVERAGE_REVIEW_SCORE, NUMBEROF_REVIEWS) VALUES
  (1137495, 50.9, 599),
  (1137496, 60.9, 699),
  (1137497, 70.9, 799);