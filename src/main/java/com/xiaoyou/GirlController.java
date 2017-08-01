package com.xiaoyou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by xiaoyou.wyz on 2017/8/1.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private  GirlService girlService;

    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> getGirlList(){
        return girlRepository.findAll();
    }

    /**
     * 增加一个女生
     * @param cupsize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public  Girl girlAdd(@RequestParam("cupSize")String cupsize,
                            @RequestParam("age")int age){
        Girl girl=new Girl();
        girl.setAge(age);
        girl.setCupSize(cupsize);
        return  girlRepository.save(girl);
    }

    /**
     * 通过id查询一个女生
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public  Girl getGirlById(@PathVariable(value = "id") int id){
        return  girlRepository.findOne(id);
    }

    /**
     * 更新一个女生信息通过id
     * @param id
     * @param age
     * @param cupsize
     * @return
     */
    @PutMapping(value = "/girls/update/{id}")
    public Girl updateGirlById(@PathVariable(value = "id")int id,@RequestParam(value = "age") int age,@RequestParam(value = "cupSize")String cupsize ){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setCupSize(cupsize);
        girl.setAge(age);
        return  girlRepository.save(girl);
    }

    /**
     * 删除女生心细通过Id
     * @param id
     */
    @DeleteMapping(value = "/girls/delete/{id}")
    public  void  deleteGirlById(@PathVariable(value = "id")int id){
        girlRepository.delete(id);
    }

    /**
     * 通过年龄获取女生列表
     * @param age
     * @return
     */
    @GetMapping(value = "girls/age/{age}")
    public  List<Girl> getGirlListByAge(@PathVariable(value = "age") int age){
        return  girlRepository.findByAge(age);
    }
    @PostMapping(value = "/girls/two")
    public  void  girlTwo(){
        girlService.insertTwo();
    }
}
