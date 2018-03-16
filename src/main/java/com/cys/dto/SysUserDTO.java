package com.cys.dto;

import com.cys.model.SysAttachment;
import com.cys.model.SysShop;
import com.cys.model.SysUser;

import java.util.List;

import javax.persistence.Transient;



/**
 * Created by liyuan on 2018/2/5.
 */
public class SysUserDTO extends SysUser {
	
	@Transient
	private String DTOStatus="200";
	public final static String  IS_NOT_IXEST="304";
	public final static String IS_EXCEPTION="500";
    public String getDTOStatus() {
		return DTOStatus;
	}

	public void setDTOStatus(String dTOStatus) {
		DTOStatus = dTOStatus;
	}

	private static final long serialVersionUID = 1L;

    /**
     * 营业执照
     */
   private List<SysAttachment>  businessLicenses;
    
   

    /**
     * 门头照片
     */
    private List<SysAttachment>  doorHeadImgs;

    /**
     * 车辆信息
     */
    private List<CarInfoDTO> carInfoDTOs;

    /**
     * 用户精度
     */
    private Double userZbY;

    /**
     * 用户纬度
     */
    private Double userZbX;

    /**
     * 传入值查询距离排序 1：顺序，2：倒叙
     */
    private String  locationSearch;

    public List<SysAttachment> getBusinessLicenses() {
        return businessLicenses;
    }

    public List<SysAttachment> getDoorHeadImgs() {
        return doorHeadImgs;
    }

    public void setDoorHeadImgs(List<SysAttachment> doorHeadImgs) {
        this.doorHeadImgs = doorHeadImgs;
    }

    public void setBusinessLicenses(List<SysAttachment> businessLicenses) {
        this.businessLicenses = businessLicenses;
    }

    public List<CarInfoDTO> getCarInfoDTOs() {
        return carInfoDTOs;
    }

    public void setCarInfoDTOs(List<CarInfoDTO> carInfoDTOs) {
        this.carInfoDTOs = carInfoDTOs;
    }

    public Double getUserZbY() {
        return userZbY;
    }

    public void setUserZbY(Double userZbY) {
        this.userZbY = userZbY;
    }

    public Double getUserZbX() {
        return userZbX;
    }

    public void setUserZbX(Double userZbX) {
        this.userZbX = userZbX;
    }

    public String getLocationSearch() {
        return locationSearch;
    }

    public void setLocationSearch(String locationSearch) {
        this.locationSearch = locationSearch;
    }
}
