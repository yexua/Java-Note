package cn.lollipop.design.mode.mediator;

/**
 * 部门接口
 */
public interface Department {

    void selfAction();

    void outAction(String dname);
}
