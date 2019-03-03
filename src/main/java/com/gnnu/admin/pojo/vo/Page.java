package com.gnnu.admin.pojo.vo;

import com.gnnu.admin.pojo.po.Poetry;

import java.util.List;

public class Page {

    private int currentPage=1;//当前页
    private int pageSize=9 ; //每一页显示的数据条数
    private int pageCount;   //总页数
    private int offset;      //分页查询的第一个参数，也就是起始索引
    private  int totalPage;
    private List<Poetry> ListDate;   //查询到的数据
    private int beginPage;

    public int getBeginPage() {
        return beginPage;
    }

    public void setBeginPage(int beginPage) {
        this.beginPage = beginPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    private int endPage;
    public Page() {
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getOffset() {
        return offset;
    }

    /**
     * 直接在getter方法中将offset算出，到时候只要得到这个currentpage和pagesize就行了
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    public List<Poetry> getListDate() {
        return ListDate;
    }

    public void setListDate(List<Poetry> listDate) {
        ListDate = listDate;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", pageCount=" + pageCount +
                ", offset=" + offset +
                ", totalPage=" + totalPage +
                ", ListDate=" + ListDate +
                ", beginPage=" + beginPage +
                ", endPage=" + endPage +
                '}';
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
