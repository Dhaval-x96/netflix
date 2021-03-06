package com.web.netflix.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "netflix", schema = "netflix")
public class NetflixTitle  implements Serializable {

    public static final long SERIALIZEI_ID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id")
    private String showId;

    @Column(name = "type", nullable = true)
    private String type;

    @Column(name = "title",nullable = true)
    private String title;

    @Column(name = "director",nullable = true)
    private String director;

    @Column(name = "cast",nullable = true)
    private String cast;

    @Column(name = "country",nullable = true)
    private String country;

    @Column(name = "date_added",nullable = true)
    private LocalDate dateAdded;

    @Column(name = "release_year",nullable = true)
    private Integer releaseYear;

    @Column(name = "rated_by",nullable = true)
    private String ratedBy;

    @Column(name = "duration",nullable = true)
    private String duration;

    @Column(name = "tags",nullable = true)
    private String tags;

    @Column(name = "description",nullable = true)
    private String description;

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRatedBy() {
        return ratedBy;
    }

    public void setRatedBy(String ratedBy) {
        this.ratedBy = ratedBy;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "NetflixTitle{" +
                "showId='" + showId + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", cast='" + cast + '\'' +
                ", country='" + country + '\'' +
                ", dateAdded=" + dateAdded +
                ", releaseYear=" + releaseYear +
                ", ratedBy='" + ratedBy + '\'' +
                ", duration='" + duration + '\'' +
                ", tags='" + tags + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
