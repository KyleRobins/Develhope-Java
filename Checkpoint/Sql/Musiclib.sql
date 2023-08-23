-- Create the Artists table
CREATE TABLE Artists (
    artist_id INT PRIMARY KEY,
    artist_name VARCHAR(255) NOT NULL,
    birth_date DATE,
    country VARCHAR(100)
);

-- Create the Albums table
CREATE TABLE Albums (
    album_id INT PRIMARY KEY,
    album_title VARCHAR(255) NOT NULL,
    release_date DATE,
    artist_id INT,
    FOREIGN KEY (artist_id) REFERENCES Artists(artist_id)
);

-- Create the Songs table
CREATE TABLE Songs (
    song_id INT PRIMARY KEY,
    song_title VARCHAR(255) NOT NULL,
    duration INT, -- Duration in seconds
    album_id INT,
    FOREIGN KEY (album_id) REFERENCES Albums(album_id)
);

-- Sample data for Artists
INSERT INTO Artists (artist_id, artist_name, birth_date, country)
VALUES
    (1, 'Kyle Robins', '1990-05-15', 'USA'),
    (2, 'Kamar Baraka', '1985-09-20', 'UK');

-- Sample data for Albums
INSERT INTO Albums (album_id, album_title, release_date, artist_id)
VALUES
    (1, 'Greatest Hits', '2010-01-01', 1),
    (2, 'Songs of happines', '2015-06-15', 2);

-- Sample data for Songs
INSERT INTO Songs (song_id, song_title, duration, album_id)
VALUES
    (1, 'Song A', 240, 1),
    (2, 'Song B', 180, 1),
    (3, 'Song X', 210, 2),
    (4, 'Song Y', 280, 2);
