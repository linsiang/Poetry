package com.gnnu.admin.web;

import com.gnnu.admin.dao.PoetryPageDao;
import com.gnnu.admin.dao.poetryDao;
import com.gnnu.admin.pojo.po.Poetry;
import com.gnnu.admin.pojo.vo.Page;
import com.gnnu.admin.pojo.vo.PoetryPage;
import com.gnnu.admin.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
public class PoetryAction {
    @Autowired
    private PoetryPageDao poetryPageDao;
    @Autowired
    private poetryDao poetry;
     @Autowired
    PageService pageService;
    /**
     * 这是低端版的显示诗词
     * @param model
     * @return
     */
    @RequestMapping(value="/listPoetry" ,method= RequestMethod.GET)
    public String  fuckerPoetry(Model model){
        List<Poetry> listPoetry =poetry.listPoetry();
        model.addAttribute("listPoetry",listPoetry);
        return "showPoetry";

    }
    @RequestMapping(value = "/poetryPage", method=RequestMethod.GET)
    public String shitPoetry(PoetryPage poetryPage,Model model){

             List<Poetry> listPoetry = poetryPageDao.findPoetryByPage(poetryPage);
             model.addAttribute("listPoetry",listPoetry);
             return "showPoetry";
    }

    @RequestMapping(value = "/delete", method=RequestMethod.GET)
      public String toDeletePoetry(int id){
            poetryPageDao.deletePoetry(id);
            return "redirect:listPoetry";
    }
    @RequestMapping(value = "/toAddPoetry" ,method=RequestMethod.GET)
            public String toAddPoetry(){
               return "addPoetry";
            }

       @RequestMapping(value="/addPoetry" ,method=RequestMethod.POST)
     public String reallAddPotry(Poetry poetry){
           System.out.println(poetry);
           poetryPageDao.reallAddPoetry(poetry);
           return "redirect:pageVo";
       }
       @RequestMapping(value = "/toUpdate", method=RequestMethod.GET)
         public String toUpdatePoetry(int id,Model model){
         Poetry poetry1 = poetryPageDao.toUpdatePoetry(id);
       //  Page page = new Page();
         //利用id得出当前页是多少页
         //  List<Poetry> list = pageService.findAll();
          // int pageIndex=list.size();
         //  int currentPage = (pageIndex-1)/page.getPageSize();
      //   int currentPage = SelectPageFromId.theCurrentPage(id);
         model.addAttribute("poetry1",poetry1);
        //  model.addAttribute("currentPage",currentPage);
         return "updatePoetry";

       }


       @RequestMapping(value = "/reupdatePoetry" ,method=RequestMethod.POST)
       public String updatePoetry(Poetry poetry){
                poetryPageDao.updatePoetry(poetry);
              //  int currentPage = poetry.getPoetry_id();

                return "redirect:pageVo";
       }
}
