package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "plate_let_info")
@Component
public class PlateLetInfo {
    @Id
    private Integer id;

    /**
     * 欧赔ID
     */
    @Column(name = "plante_let_id")
    private String planteLetId;

    /**
     * 博彩公司
     */
    private String company;

    /**
     * 让球数
     */
    @Column(name = "let_point")
    private Integer letPoint;

    /**
     * 胜赔临盘
     */
    @Column(name = "win_presence")
    private Float winPresence;

    /**
     * 胜赔初盘
     */
    @Column(name = "win_initial")
    private Float winInitial;

    /**
     * 平赔初盘
     */
    @Column(name = "draw_initial")
    private Float drawInitial;

    /**
     * 平赔临盘
     */
    @Column(name = "draw_presence")
    private Float drawPresence;

    /**
     * 负赔临盘
     */
    @Column(name = "lose_presence")
    private Float losePresence;

    /**
     * 负赔初盘
     */
    @Column(name = "lose_initial")
    private Float loseInitial;

    /**
     * 胜凯利指数初盘
     */
    @Column(name = "kelly_win_initial")
    private Float kellyWinInitial;

    /**
     * 胜凯利指数临盘
     */
    @Column(name = "kelly_win_presence")
    private Float kellyWinPresence;

    /**
     * 平凯利指数初盘
     */
    @Column(name = "kelly_draw_initial")
    private Float kellyDrawInitial;

    /**
     * 平凯利指数临盘
     */
    @Column(name = "kelly_draw_presence")
    private Float kellyDrawPresence;

    /**
     * 胜凯利指数初盘
     */
    @Column(name = "kelly_lose_initial")
    private Float kellyLoseInitial;

    /**
     * 负凯利指数临盘
     */
    @Column(name = "kelly_lose_presence")
    private Float kellyLosePresence;

    /**
     * 返还率初盘
     */
    @Column(name = "return_initial")
    private Float returnInitial;

    /**
     * 返还率临盘
     */
    @Column(name = "return_presence")
    private Float returnPresence;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取欧赔ID
     *
     * @return plante_let_id - 欧赔ID
     */
    public String getPlanteLetId() {
        return planteLetId;
    }

    /**
     * 设置欧赔ID
     *
     * @param planteLetId 欧赔ID
     */
    public void setPlanteLetId(String planteLetId) {
        this.planteLetId = planteLetId;
    }

    /**
     * 获取博彩公司
     *
     * @return company - 博彩公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置博彩公司
     *
     * @param company 博彩公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取让球数
     *
     * @return let_point - 让球数
     */
    public Integer getLetPoint() {
        return letPoint;
    }

    /**
     * 设置让球数
     *
     * @param letPoint 让球数
     */
    public void setLetPoint(Integer letPoint) {
        this.letPoint = letPoint;
    }

    /**
     * 获取胜赔临盘
     *
     * @return win_presence - 胜赔临盘
     */
    public Float getWinPresence() {
        return winPresence;
    }

    /**
     * 设置胜赔临盘
     *
     * @param winPresence 胜赔临盘
     */
    public void setWinPresence(Float winPresence) {
        this.winPresence = winPresence;
    }

    /**
     * 获取胜赔初盘
     *
     * @return win_initial - 胜赔初盘
     */
    public Float getWinInitial() {
        return winInitial;
    }

    /**
     * 设置胜赔初盘
     *
     * @param winInitial 胜赔初盘
     */
    public void setWinInitial(Float winInitial) {
        this.winInitial = winInitial;
    }

    /**
     * 获取平赔初盘
     *
     * @return draw_initial - 平赔初盘
     */
    public Float getDrawInitial() {
        return drawInitial;
    }

    /**
     * 设置平赔初盘
     *
     * @param drawInitial 平赔初盘
     */
    public void setDrawInitial(Float drawInitial) {
        this.drawInitial = drawInitial;
    }

    /**
     * 获取平赔临盘
     *
     * @return draw_presence - 平赔临盘
     */
    public Float getDrawPresence() {
        return drawPresence;
    }

    /**
     * 设置平赔临盘
     *
     * @param drawPresence 平赔临盘
     */
    public void setDrawPresence(Float drawPresence) {
        this.drawPresence = drawPresence;
    }

    /**
     * 获取负赔临盘
     *
     * @return lose_presence - 负赔临盘
     */
    public Float getLosePresence() {
        return losePresence;
    }

    /**
     * 设置负赔临盘
     *
     * @param losePresence 负赔临盘
     */
    public void setLosePresence(Float losePresence) {
        this.losePresence = losePresence;
    }

    /**
     * 获取负赔初盘
     *
     * @return lose_initial - 负赔初盘
     */
    public Float getLoseInitial() {
        return loseInitial;
    }

    /**
     * 设置负赔初盘
     *
     * @param loseInitial 负赔初盘
     */
    public void setLoseInitial(Float loseInitial) {
        this.loseInitial = loseInitial;
    }

    /**
     * 获取胜凯利指数初盘
     *
     * @return kelly_win_initial - 胜凯利指数初盘
     */
    public Float getKellyWinInitial() {
        return kellyWinInitial;
    }

    /**
     * 设置胜凯利指数初盘
     *
     * @param kellyWinInitial 胜凯利指数初盘
     */
    public void setKellyWinInitial(Float kellyWinInitial) {
        this.kellyWinInitial = kellyWinInitial;
    }

    /**
     * 获取胜凯利指数临盘
     *
     * @return kelly_win_presence - 胜凯利指数临盘
     */
    public Float getKellyWinPresence() {
        return kellyWinPresence;
    }

    /**
     * 设置胜凯利指数临盘
     *
     * @param kellyWinPresence 胜凯利指数临盘
     */
    public void setKellyWinPresence(Float kellyWinPresence) {
        this.kellyWinPresence = kellyWinPresence;
    }

    /**
     * 获取平凯利指数初盘
     *
     * @return kelly_draw_initial - 平凯利指数初盘
     */
    public Float getKellyDrawInitial() {
        return kellyDrawInitial;
    }

    /**
     * 设置平凯利指数初盘
     *
     * @param kellyDrawInitial 平凯利指数初盘
     */
    public void setKellyDrawInitial(Float kellyDrawInitial) {
        this.kellyDrawInitial = kellyDrawInitial;
    }

    /**
     * 获取平凯利指数临盘
     *
     * @return kelly_draw_presence - 平凯利指数临盘
     */
    public Float getKellyDrawPresence() {
        return kellyDrawPresence;
    }

    /**
     * 设置平凯利指数临盘
     *
     * @param kellyDrawPresence 平凯利指数临盘
     */
    public void setKellyDrawPresence(Float kellyDrawPresence) {
        this.kellyDrawPresence = kellyDrawPresence;
    }

    /**
     * 获取胜凯利指数初盘
     *
     * @return kelly_lose_initial - 胜凯利指数初盘
     */
    public Float getKellyLoseInitial() {
        return kellyLoseInitial;
    }

    /**
     * 设置胜凯利指数初盘
     *
     * @param kellyLoseInitial 胜凯利指数初盘
     */
    public void setKellyLoseInitial(Float kellyLoseInitial) {
        this.kellyLoseInitial = kellyLoseInitial;
    }

    /**
     * 获取负凯利指数临盘
     *
     * @return kelly_lose_presence - 负凯利指数临盘
     */
    public Float getKellyLosePresence() {
        return kellyLosePresence;
    }

    /**
     * 设置负凯利指数临盘
     *
     * @param kellyLosePresence 负凯利指数临盘
     */
    public void setKellyLosePresence(Float kellyLosePresence) {
        this.kellyLosePresence = kellyLosePresence;
    }

    /**
     * 获取返还率初盘
     *
     * @return return_initial - 返还率初盘
     */
    public Float getReturnInitial() {
        return returnInitial;
    }

    /**
     * 设置返还率初盘
     *
     * @param returnInitial 返还率初盘
     */
    public void setReturnInitial(Float returnInitial) {
        this.returnInitial = returnInitial;
    }

    /**
     * 获取返还率临盘
     *
     * @return return_presence - 返还率临盘
     */
    public Float getReturnPresence() {
        return returnPresence;
    }

    /**
     * 设置返还率临盘
     *
     * @param returnPresence 返还率临盘
     */
    public void setReturnPresence(Float returnPresence) {
        this.returnPresence = returnPresence;
    }
}