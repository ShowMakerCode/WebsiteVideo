package Dao.EntityImpDAO;

import Dao.AbstractDao;
import Dao.InterfaceClass.FavariteDao;
import Model.Favorite;

public class FavoriteImp extends AbstractDao<Favorite> implements FavariteDao{

	@Override
	public Favorite findById(Integer id) {
		return super.findById(Favorite.class, id);
	}

	@Override
	public Favorite findByUserisLike(Favorite entyti) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Favorite create(Favorite entity) {
		// TODO Auto-generated method stub
		return super.create(entity);
	}

	@Override
	public Favorite update(Favorite entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public Favorite delete(Favorite entity) {
		// TODO Auto-generated method stub
		return super.delete(entity);
	}

}
