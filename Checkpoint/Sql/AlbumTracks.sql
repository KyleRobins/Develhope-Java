SELECT
    s.song_title AS track_title,
    s.duration AS track_duration
FROM
    Albums a
JOIN
    Songs s ON a.album_id = s.album_id
WHERE
    a.album_title = 'Greatest Hits';
