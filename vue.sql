CREATE MATERIALIZED VIEW vue_taches_par_projet AS
SELECT 
    p.projet_id AS projet_id,
    p.name AS projet_name,
    COUNT(t.task_id) AS nombre_taches
FROM 
    projet p
LEFT JOIN 
    task t ON p.projet_id = t.projet_id
GROUP BY 
    p.projet_id, p.name;