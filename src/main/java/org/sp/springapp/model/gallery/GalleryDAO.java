package org.sp.springapp.model.gallery;

import java.util.List;

import org.sp.springapp.domain.Gallery;

public interface GalleryDAO {
	public void insert(Gallery gallery);
	public List selectAll();
	public Gallery select(int gallery_idx);
	public void update(Gallery gallery);
	public void delete(int gallery_idx);
}
