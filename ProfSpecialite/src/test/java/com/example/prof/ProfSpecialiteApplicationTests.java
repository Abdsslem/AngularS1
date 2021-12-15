package com.example.prof;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.prof.entities.Prof;
import com.example.prof.entities.Specialite;
import com.example.prof.repos.ProfRepository;
@SpringBootTest
class ProfSpecialiteApplicationTests {
@Autowired
private ProfRepository profRepository;

@Test
public void testCreateProf() {
Prof prof = new Prof("Ahmed","Youcef","97845456");
profRepository.save(prof);
}

@Test
public void testFindProf()
{
	Prof p = profRepository.findById(2L).get();

System.out.println(p);
}

@Test
public void testUpdateProf()
{
Prof p = profRepository.findById(2L).get();
p.setPrenomProf("ben ahmed");
profRepository.save(p);
}


@Test
public void testDeleteProf()
{
profRepository.deleteById(1L);;
}
@Test
public void testListerTousProfs()
{
List<Prof> profs = profRepository.findAll();
for (Prof p : profs)
{
System.out.println(p);
}

}



@Test
public void testFindByNomProf()
{
List<Prof> profs = profRepository.findByNomProf("Salah");

for (Prof p : profs)
{
System.out.println(p);
}

}



@Test
public void testFindByNomProfContains ()
{
List<Prof> profs=profRepository.findByNomProfContains("Salah");

for (Prof p : profs)
{
System.out.println(p);
} }




@Test
public void testfindByNomTel()
{
List<Prof> profs = profRepository.findByNomTel("Salah", "97878456");
for (Prof p : profs)
{
System.out.println(p);
}

}


@Test
public void testfindBySpecialite()
{
Specialite spec = new Specialite();
spec.setIdSpec(2L);
List<Prof> profs = profRepository.findBySpecialite(spec);
for (Prof p : profs)
{
System.out.println(p);
}
}
@Test
public void findBySpecialiteIdSpec(){
List<Prof> profs = profRepository.findBySpecialiteIdSpec(1L);
for (Prof p : profs)
{
System.out.println(p);
}

}
@Test
public void testfindByOrderByNomProduitAsc()
{
List<Prof> profs =

profRepository.findByOrderByNomProfAsc();
for (Prof p : profs)
{
System.out.println(p);
}

}
@Test
public void testTrierProfPrenomProf()
{
List<Prof> profs = profRepository.trierProfPrenomProf();
for (Prof p : profs)
{
System.out.println(p);
}

}
}