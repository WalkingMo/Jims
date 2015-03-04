package org.mo.jims.coop.entity;

import org.mo.open.common.entity.Permission;
import org.mo.open.common.entity.Role;


/**
 * TbRolePermissionId entity. @author MyEclipse Persistence Tools
 */

public class TbRolePermissionId implements java.io.Serializable {

	// Fields

	private Role tbRole;
	private Permission tbPermission;

	// Constructors

	/** default constructor */
	public TbRolePermissionId() {
	}

	/** full constructor */
	public TbRolePermissionId(Role tbRole, Permission tbPermission) {
		this.tbRole = tbRole;
		this.tbPermission = tbPermission;
	}

	// Property accessors

	public Role getTbRole() {
		return this.tbRole;
	}

	public void setTbRole(Role tbRole) {
		this.tbRole = tbRole;
	}

	public Permission getTbPermission() {
		return this.tbPermission;
	}

	public void setTbPermission(Permission tbPermission) {
		this.tbPermission = tbPermission;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbRolePermissionId))
			return false;
		TbRolePermissionId castOther = (TbRolePermissionId) other;

		return ((this.getTbRole() == castOther.getTbRole()) || (this
				.getTbRole() != null && castOther.getTbRole() != null && this
				.getTbRole().equals(castOther.getTbRole())))
				&& ((this.getTbPermission() == castOther.getTbPermission()) || (this
						.getTbPermission() != null
						&& castOther.getTbPermission() != null && this
						.getTbPermission().equals(castOther.getTbPermission())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTbRole() == null ? 0 : this.getTbRole().hashCode());
		result = 37
				* result
				+ (getTbPermission() == null ? 0 : this.getTbPermission()
						.hashCode());
		return result;
	}

}