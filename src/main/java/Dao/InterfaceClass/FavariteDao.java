package Dao.InterfaceClass;

import Model.Favorite;

public interface FavariteDao {
	Favorite findById(Integer id);
	Favorite findByUserisLike(Favorite entyti);
	Favorite create(Favorite entity);
	Favorite update(Favorite entity);
	Favorite delete(Favorite entity);
}
