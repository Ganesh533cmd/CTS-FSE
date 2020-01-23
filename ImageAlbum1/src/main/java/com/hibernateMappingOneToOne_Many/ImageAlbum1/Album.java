package com.hibernateMappingOneToOne_Many.ImageAlbum1;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.IIOImage;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Album {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

	@Column(name="email")
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="album_detail_id")
	private AlbumDetail albumDetail;
	
	@OneToMany(mappedBy="album",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	private List<IIOImage> images;
		public void Album(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public void add(Image tempImage) {
		
		if (images == null) {
			images = new ArrayList<>();
		}
		
		Album image = null;
		image.add(tempImage);
		
		tempImage.setAlbum(this);
	}

}
