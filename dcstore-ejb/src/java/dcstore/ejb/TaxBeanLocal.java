// This file is a part of dcstore project,
// licensed under GPLv2
//
// Dominik Cebula
// dominikcebula@gmail.com
package dcstore.ejb;

import dcstore.jpa.TaxEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author dcebula
 */
@Local
public interface TaxBeanLocal {

    public void add(double rate);

    public void del(int idTax);

    public List<TaxEntity> getAll();
}