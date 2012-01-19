package org.jboss.jdf.example.ticketmonster.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * A reference to a media object such as images, sound bites, video recordings, that can
 * be used in the application.
 *
 * @author Marius Bogoevici
 */
@Entity
@JsonIgnoreProperties("content")
public class MediaItem implements Serializable {

    private static final long serialVersionUID = -3190368407410663590L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "MEDIA_TYPE")
    private String mediaType;

    @Basic(fetch = FetchType.LAZY)
    @Lob
    private byte[] content;

    public Long getId() {
        return id;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
