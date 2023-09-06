package org.sp.springapp.model.gallery;

import java.util.List;

import org.sp.springapp.domain.GalleryImg;

public interface GalleryImgDAO {
	public void insert(GalleryImg galleryImg);
	public List selectAll();
	public GalleryImg select(int gallery_img_idx);
	public void update(GalleryImg galleryImg);
	public void delete(int gallery_img_idx);
}
