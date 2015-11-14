package org.shujito.socialbox;

import java.util.HashMap;
import java.util.Map;

import de.neuland.jade4j.Jade4J;

/**
 * @author Alberto Ramos, 11/13/15.
 */
public class Template {
	public static String render(String name) throws Exception {
		String rendered = Jade4J.render("./_templates/" + name, null);
		Map<String, Object> template = new HashMap<>();
		template.put("template", rendered);
		return Jade4J.render("./_templates/_layout.jade", template);
	}
}
