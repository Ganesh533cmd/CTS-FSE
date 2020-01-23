package com.hibernateMappingOneToOne_Many.ImageAlbum1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class AlbumDetail {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="names")
	private String names;
	
	@Column(name="balayya")
	private String balayya;
		@OneToOne(mappedBy="albumDetail", 
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	private Album album;
	
	public AlbumDetail(String names, String balayya) {
		this.names = names;
		this.balayya = balayya;
	}

	
}
