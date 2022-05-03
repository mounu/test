SELECT T1.*

FROM vehicle T1

INNER JOIN

(

    SELECT manufacturer, MAX(price) AS max_price

    FROM vehicle

    GROUP BY manufacturer

) T2

    ON T1.manufacturer = t2.manufacturer AND t1.price = t2.price;
