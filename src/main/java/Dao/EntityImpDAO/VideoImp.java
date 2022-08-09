package Dao.EntityImpDAO;

import java.util.List;

import Dao.AbstractDao;
import Dao.InterfaceClass.VideoDao;
import Model.Video;

public class VideoImp extends AbstractDao<Video> implements VideoDao{

	@Override
	public Video findById(Integer id) {
		// TODO Auto-generated method stub
		return super.findById(Video.class, id);
	}

	@Override
	public Video findByHref(String href) {
		String query = "Select o from video o where o.href = ?0";
		return super.finOne(Video.class, query, href);
	}

	@Override
	public List<Video> findAll() {
		return super.findAll(Video.class, true);
	}

	@Override
	public List<Video> findAll(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return super.findAll(Video.class, true, pageNumber, pageSize);
	}

}
