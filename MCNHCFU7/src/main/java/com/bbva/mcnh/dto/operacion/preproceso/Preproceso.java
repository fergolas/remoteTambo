package com.bbva.mcnh.dto.operacion.preproceso;

import com.bbva.apx.dto.AbstractDTO;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Class Name: Preproceso
 * Description: Initial class to develop the DTO
 */

public class Preproceso extends AbstractDTO {
	private static final long serialVersionUID = 2931699728946643245L;

    // Attributes section for the DTO
	private String name;
	private String surname;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final Preproceso rhs = (Preproceso) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(name, rhs.name)
					.append(surname, rhs.surname)
					.isEquals();
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.name)
			.append(this.surname)
			.toHashCode();
	}

	/*
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("name", name)
			.append("surname", surname)
			.toString();
	}
}
