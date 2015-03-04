package org.mo.jims.coop.entity;

import org.mo.open.common.entity.Role;
import org.mo.open.common.entity.User;


/**
 * TbUserRoleId entity. @author MyEclipse Persistence Tools
 */

public class TbUserRoleId implements java.io.Serializable {

	// Fields

	private User tbUser;
	private Role tbRole;

	// Constructors

	/** default constructor */
	public TbUserRoleId() {
	}

	/** full constructor */
	public TbUserRoleId(User tbUser, Role tbRole) {
		this.tbUser = tbUser;
		this.tbRole = tbRole;
	}

	// Property accessors

	public User getTbUser() {
		return this.tbUser;
	}

	public void setTbUser(User tbUser) {
		this.tbUser = tbUser;
	}

	public Role getTbRole() {
		return this.tbRole;
	}

	public void setTbRole(Role tbRole) {
		this.tbRole = tbRole;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbUserRoleId))
			return false;
		TbUserRoleId castOther = (TbUserRoleId) other;

		return ((this.getTbUser() == castOther.getTbUser()) || (this
				.getTbUser() != null && castOther.getTbUser() != null && this
				.getTbUser().equals(castOther.getTbUser())))
				&& ((this.getTbRole() == castOther.getTbRole()) || (this
						.getTbRole() != null && castOther.getTbRole() != null && this
						.getTbRole().equals(castOther.getTbRole())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTbUser() == null ? 0 : this.getTbUser().hashCode());
		result = 37 * result
				+ (getTbRole() == null ? 0 : this.getTbRole().hashCode());
		return result;
	}

}