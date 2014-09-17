/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;

import java.math.BigDecimal;
import java.util.Set;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.logistic.dao.springdata.PackageDAO;

/**
 *
 * @author Sylwia
 */
@ContextConfiguration("/core-test-context.xml")
@TransactionConfiguration(defaultRollback = false)
public class TestPackage extends AbstractTransactionalJUnit4SpringContextTests {
    
    @Autowired
    private PackageDAO packageDAO;
    
    @Test
    public void testSavePackage() {
        pl.altkom.logistic.core.model.Package p = new pl.altkom.logistic.core.model.Package();
        p.setWidth(new BigDecimal(12));
        p.setHeight(new BigDecimal(24));
        p.setLength(new BigDecimal(36));
        p.setTyp(pl.altkom.logistic.core.model.Package.PackageTyp.EXPRESS);
       
        packageDAO.save(p);
    }
    
    @Test
    public void testFindPackageByTyp() {
        Set<pl.altkom.logistic.core.model.Package> packages = packageDAO.findByTyp(pl.altkom.logistic.core.model.Package.PackageTyp.EXPRESS);
        assertFalse(packages.isEmpty());
    }
    
    @Test
    public void testFindPackageByVolume() {
        Set<pl.altkom.logistic.core.model.Package> packages = packageDAO.findByWidthAndHeightAndLength(new BigDecimal(12), new BigDecimal(24), new BigDecimal(36));
        assertFalse(packages.isEmpty());
    }
    
}
