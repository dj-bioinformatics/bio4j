package com.bio4j.model.uniprot.edges;

import com.bio4j.model.uniprot.UniprotGraph;
import com.bio4j.model.uniprot.vertices.PIR;
import com.bio4j.model.uniprot.vertices.Protein;
import com.ohnosequences.typedGraphs.UntypedGraph;

/**
 * Created by ppareja on 7/28/2014.
 */
public final class ProteinPIR <I extends UntypedGraph<RV, RVT, RE, RET>, RV, RVT, RE, RET>
		extends
		UniprotGraph.UniprotEdge<
				Protein<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.ProteinType,
				ProteinPIR<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.ProteinPIRType,
				PIR<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.PIRType,
				I, RV, RVT, RE, RET
				> {

	public ProteinPIR(RE edge, UniprotGraph<I, RV, RVT, RE, RET>.ProteinPIRType type) {

		super(edge, type);
	}

	@Override
	public ProteinPIR<I, RV, RVT, RE, RET> self() {
		return this;
	}
}