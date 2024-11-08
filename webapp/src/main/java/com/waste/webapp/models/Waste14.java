package com.waste.webapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "domestic14final1")
public class Waste14 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true, nullable = false)
	private String area;
	
	private String recyclabesCollected;
	private String recyclabesRecyled;
	private String recyclabesDisposed;
	private String organicCollected;
	private String organicRecycled;
	private String organicDisposed;
	private String residentialCollected;
	private String residentialRecycled;
	private String residentialDisposed;
	private String totalDomestic;
	private String totalRecycled;
	private String totalDisposal;
	private String recylingRate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRecyclabesCollected() {
		return recyclabesCollected;
	}
	public void setRecyclabesCollected(String recyclabesCollected) {
		this.recyclabesCollected = recyclabesCollected;
	}
	public String getRecyclabesRecyled() {
		return recyclabesRecyled;
	}
	public void setRecyclabesRecyled(String recyclabesRecyled) {
		this.recyclabesRecyled = recyclabesRecyled;
	}
	public String getRecyclabesDisposed() {
		return recyclabesDisposed;
	}
	public void setRecyclabesDisposed(String recyclabesDisposed) {
		this.recyclabesDisposed = recyclabesDisposed;
	}
	public String getOrganicCollected() {
		return organicCollected;
	}
	public void setOrganicCollected(String organicCollected) {
		this.organicCollected = organicCollected;
	}
	public String getOrganicRecycled() {
		return organicRecycled;
	}
	public void setOrganicRecycled(String organicRecycled) {
		this.organicRecycled = organicRecycled;
	}
	public String getOrganicDisposed() {
		return organicDisposed;
	}
	public void setOrganicDisposed(String organicDisposed) {
		this.organicDisposed = organicDisposed;
	}
	public String getResidentialCollected() {
		return residentialCollected;
	}
	public void setResidentialCollected(String residentialCollected) {
		this.residentialCollected = residentialCollected;
	}
	public String getResidentialRecycled() {
		return residentialRecycled;
	}
	public void setResidentialRecycled(String residentialRecycled) {
		this.residentialRecycled = residentialRecycled;
	}
	public String getResidentialDisposed() {
		return residentialDisposed;
	}
	public void setResidentialDisposed(String residentialDisposed) {
		this.residentialDisposed = residentialDisposed;
	}
	public String getTotalDomestic() {
		return totalDomestic;
	}
	public void setTotalDomestic(String totalDomestic) {
		this.totalDomestic = totalDomestic;
	}
	public String getTotalRecycled() {
		return totalRecycled;
	}
	public void setTotalRecycled(String totalRecycled) {
		this.totalRecycled = totalRecycled;
	}
	public String getTotalDisposal() {
		return totalDisposal;
	}
	public void setTotalDisposal(String totalDisposal) {
		this.totalDisposal = totalDisposal;
	}
	public String getRecylingRate() {
		return recylingRate;
	}
	public void setRecylingRate(String recylingRate) {
		this.recylingRate = recylingRate;
	}
}
