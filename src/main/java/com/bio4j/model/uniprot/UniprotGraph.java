package com.bio4j.model.uniprot;

import com.bio4j.model.uniprot.nodes.*;
import com.bio4j.model.uniprot.relationships.BookCity;
import com.bio4j.model.uniprot.relationships.ProteinDataset;
import com.ohnosequences.typedGraphs.*;

import java.util.Date;

/**
 * @author <a href="mailto:ppareja@era7.com">Pablo Pareja Tobes</a>
 */
public abstract class UniprotGraph<
		// untyped graph
		I extends UntypedGraph<RV, RVT, RE, RET>,
		// vertices
		RV, RVT,
		// edges
		RE, RET
		>
		implements
		TypedGraph<
				UniprotGraph<I, RV, RVT, RE, RET>,
				I, RV, RVT, RE, RET
				> {

	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	// types
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	// vertices
	public abstract ArticleType Article();

	public abstract BookType Book();

	public abstract CityType City();

	public abstract CommentTypeType CommentType();

	public abstract ConsortiumType Consortium();

	public abstract DatasetType Dataset();

	public abstract CountryType Country();

	public abstract DBType DB();

	public abstract EMBLType EMBL();

	public abstract EnsemblType Ensembl();

	public abstract FeatureType FeatureType();

	public abstract InstituteType Institute();

	public abstract InterproType Interpro();

	public abstract JournalType Journal();

	public abstract KeggType Kegg();

	public abstract KeywordType Keyword();

	public abstract OnlineArticleType OnlineArticle();

	public abstract OrganismType Organism();

	public abstract OnlineJournalType OnlineJournal();

	public abstract PatentType Patent();

	public abstract PersonType Person();

	public abstract PfamType Pfam();

	public abstract PIRType PIR();

	public abstract ProteinType Protein();

	public abstract PublisherType Publisher();

	public abstract PubmedType Pubmed();

	public abstract ReactomeTermType ReactomeTerm();

	public abstract ReferenceType Reference();

	public abstract RefSeqType RefSeq();

	public abstract SequenceCautionType SequenceCaution();

	public abstract SubcellularLocationType SubcellularLocation();

	public abstract SubmissionType Submission();

	public abstract TaxonType Taxon();

	public abstract ThesisType Thesis();

	public abstract UniGeneType UniGene();

	public abstract UnpublishedObservationType UnpublishedObservation();

	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	// edges

	public abstract ArticlePubmedType ArticlePubmed();

	public abstract ArticleJournalType ArticleJournalType();

	public abstract BookCityType BookCity();

	public abstract BookPublisherType BookPublisher();

	public abstract InstituteCountryType InstituteCountry();

	public abstract OnlineArticleJournalType OnlineArticleJournal();

	public abstract OrganismTaxonType OrganismTaxon();

	public abstract ProteinCommentType ProteinComment();

	public abstract ProteinDatasetType ProteinDataset();

	public abstract ProteinEMBLType ProteinEMBL();

	public abstract ProteinEnsemblType ProteinEnsembl();

	public abstract ProteinInterproType ProteinInterpro();

	public abstract ProteinKeggType ProteinKegg();

	public abstract ProteinKeywordType ProteinKeyword();

	public abstract ProteinInterproType ProteinOrganism();

	public abstract ProteinReactomeTermType ProteinReactomeTerm();

	public abstract ProteinSubcellularLocationType ProteinSubcellularLocation();

	public abstract ProteinUniGeneType ProteinUniGene();

	public abstract ProteinRefSeqType ProteinRefSeq();

	public abstract ProteinReferenceType ProteinReference();

	public abstract ReferenceArticleType ReferenceArticle();

	public abstract ReferenceBookType ReferenceBook();

	public abstract ReferenceOnlineArticleType ReferenceOnlineArticle();

	public abstract ReferenceThesisType ReferenceThesis();

	public abstract ReferenceSubmissionType ReferenceSubmission();

	public abstract ReferenceUnpublishedObservationType ReferenceUnpublishedObservation();

	public abstract TaxonParentType TaxonParent();

	public abstract ThesisInstituteType ThesisInstitute();

	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Vertex types

	public final class ArticleType
			extends
			UniprotVertexType<
					Article<I, RV, RVT, RE, RET>,
					UniprotGraph<I, RV, RVT, RE, RET>.ArticleType
					> {

		public final doId doId = new doId();
		public final title title = new title();

		protected ArticleType(RVT raw) {
			super(raw);
		}

		@Override
		public ArticleType value() {
			return graph().Article();
		}

		@Override
		public Article<I, RV, RVT, RE, RET> from(RV vertex) {
			return new Article<I, RV, RVT, RE, RET>(vertex, this);
		}

		public final class doId
				extends
				UniprotVertexProperty<Article<I, RV, RVT, RE, RET>, ArticleType, doId, String> {
			public doId() {
				super(ArticleType.this.graph().Article());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}

		public final class title
				extends
				UniprotVertexProperty<Article<I, RV, RVT, RE, RET>, ArticleType, title, String> {
			public title() {
				super(ArticleType.this.graph().Article());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}

	}


	public final class BookType
			extends
			UniprotVertexType<
					Book<I, RV, RVT, RE, RET>,
					UniprotGraph<I, RV, RVT, RE, RET>.BookType
					> {

		public final name name = new name();

		protected BookType(RVT raw) {
			super(raw);
		}

		@Override
		public BookType value() {
			return graph().Book();
		}

		@Override
		public Book<I, RV, RVT, RE, RET> from(RV vertex) {
			return new Book<I, RV, RVT, RE, RET>(vertex, this);
		}

		public final class name
				extends
				UniprotVertexProperty<Book<I, RV, RVT, RE, RET>, BookType, name, String> {
			public name() {
				super(BookType.this.graph().Book());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}

	}

	public final class CityType
			extends
			UniprotVertexType<
					City<I, RV, RVT, RE, RET>,
					UniprotGraph<I, RV, RVT, RE, RET>.CityType
					> {

		public final name name = new name();

		protected CityType(RVT raw) {
			super(raw);
		}

		@Override
		public CityType value() {
			return graph().City();
		}

		@Override
		public City<I, RV, RVT, RE, RET> from(RV vertex) {
			return new City<I, RV, RVT, RE, RET>(vertex, this);
		}

		public final class name
				extends
				UniprotVertexProperty<City<I, RV, RVT, RE, RET>, CityType, name, String> {
			public name() {
				super(CityType.this.graph().City());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}

	}

	public final class CommentTypeType
			extends
			UniprotVertexType<
					CommentType<I, RV, RVT, RE, RET>,
					UniprotGraph<I, RV, RVT, RE, RET>.CommentTypeType
					> {

		public final name name = new name();

		protected CommentTypeType(RVT raw) {
			super(raw);
		}

		@Override
		public CommentTypeType value() {
			return graph().CommentType();
		}

		@Override
		public CommentType<I, RV, RVT, RE, RET> from(RV vertex) {
			return new CommentType<I, RV, RVT, RE, RET>(vertex, this);
		}

		public final class name
				extends
				UniprotVertexProperty<CommentType<I, RV, RVT, RE, RET>, CommentTypeType, name, String> {
			public name() {
				super(CommentTypeType.this.graph().CommentType());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}

	}

	public final class CountryType
			extends
			UniprotVertexType<
					Country<I, RV, RVT, RE, RET>,
					UniprotGraph<I, RV, RVT, RE, RET>.CountryType
					> {

		public final name name = new name();

		protected CountryType(RVT raw) {
			super(raw);
		}

		@Override
		public CountryType value() {
			return graph().Country();
		}

		@Override
		public Country<I, RV, RVT, RE, RET> from(RV vertex) {
			return new Country<I, RV, RVT, RE, RET>(vertex, this);
		}

		public final class name
				extends
				UniprotVertexProperty<Country<I, RV, RVT, RE, RET>, CountryType, name, String> {
			public name() {
				super(CountryType.this.graph().Country());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}

	}

	public final class DatasetType
			extends
			UniprotVertexType<
					Dataset<I, RV, RVT, RE, RET>,
					UniprotGraph<I, RV, RVT, RE, RET>.DatasetType
					> {

		public final name name = new name();

		protected DatasetType(RVT raw) {
			super(raw);
		}

		@Override
		public DatasetType value() {
			return graph().Dataset();
		}

		@Override
		public Dataset<I, RV, RVT, RE, RET> from(RV vertex) {
			return new Dataset<I, RV, RVT, RE, RET>(vertex, this);
		}

		public final class name
				extends
				UniprotVertexProperty<Dataset<I, RV, RVT, RE, RET>, DatasetType, name, String> {
			public name() {
				super(DatasetType.this.graph().Dataset());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}

	}

	public final class ProteinType
			extends
			UniprotVertexType<
					Protein<I, RV, RVT, RE, RET>,
					UniprotGraph<I, RV, RVT, RE, RET>.ProteinType
					> {

		public final accession accession = new accession();
		public final shortName shortName = new shortName();
		public final sequence sequence = new sequence();
		public final fullname fullname = new fullname();
		public final modifiedDate modifiedDate = new modifiedDate();
		public final createdDate createdDate = new createdDate();
		public final mass mass = new mass();
		public final version version = new version();
		public final length length = new length();


		protected ProteinType(RVT raw) {
			super(raw);
		}

		@Override
		public ProteinType value() {
			return graph().Protein();
		}

		@Override
		public Protein<I, RV, RVT, RE, RET> from(RV vertex) {
			return new Protein<I, RV, RVT, RE, RET>(vertex, this);
		}

		public final class accession
				extends
				UniprotVertexProperty<Protein<I, RV, RVT, RE, RET>, ProteinType, accession, String> {
			public accession() {
				super(ProteinType.this.graph().Protein());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}
		public final class shortName
				extends
				UniprotVertexProperty<Protein<I, RV, RVT, RE, RET>, ProteinType, shortName, String> {
			public shortName() {
				super(ProteinType.this.graph().Protein());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}
		public final class sequence
				extends
				UniprotVertexProperty<Protein<I, RV, RVT, RE, RET>, ProteinType, sequence, String> {
			public sequence() {
				super(ProteinType.this.graph().Protein());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}
		public final class fullname
				extends
				UniprotVertexProperty<Protein<I, RV, RVT, RE, RET>, ProteinType, fullname, String> {
			public fullname() {
				super(ProteinType.this.graph().Protein());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}
		public final class modifiedDate
				extends
				UniprotVertexProperty<Protein<I, RV, RVT, RE, RET>, ProteinType, modifiedDate, Date> {
			public modifiedDate() {
				super(ProteinType.this.graph().Protein());
			}

			public Class<Date> valueClass() {
				return Date.class;
			}
		}
		public final class createdDate
				extends
				UniprotVertexProperty<Protein<I, RV, RVT, RE, RET>, ProteinType, createdDate, Date> {
			public createdDate() {
				super(ProteinType.this.graph().Protein());
			}

			public Class<Date> valueClass() {
				return Date.class;
			}
		}
		public final class mass
				extends
				UniprotVertexProperty<Protein<I, RV, RVT, RE, RET>, ProteinType, mass, String> {
			public mass() {
				super(ProteinType.this.graph().Protein());
			}

			public Class<String> valueClass() {
				return String.class;
			}
		}
		public final class version
				extends
				UniprotVertexProperty<Protein<I, RV, RVT, RE, RET>, ProteinType, version, Integer> {
			public version() {
				super(ProteinType.this.graph().Protein());
			}

			public Class<Integer> valueClass() {
				return Integer.class;
			}
		}
		public final class length
				extends
				UniprotVertexProperty<Protein<I, RV, RVT, RE, RET>, ProteinType, length, Integer> {
			public length() {
				super(ProteinType.this.graph().Protein());
			}

			public Class<Integer> valueClass() {
				return Integer.class;
			}
		}

		////////////////////////////////////////////////////////////////////////////////////////////////////////
		// relationships
		////////////////////////////////////////////////////////////////////////////////////////////////////////

		// proteinOrganism
		// outgoing
		public ProteinOrganism<I, RV, RVT, RE, RET> proteinOrganism_out();
		public Organism<I, RV, RVT, RE, RET>  proteinOrganism_outNodes();

		// proteinDataset
		// outgoing
		public ProteinDataset<I, RV, RVT, RE, RET> proteinDataset_out();
		public Dataset<I, RV, RVT, RE, RET>  proteinDataset_outNodes();

		// proteinInterpro
		// outgoing
		public ProteinInterpro<I, RV, RVT, RE, RET>   proteinIntepro_out();
		public Interpro<I, RV, RVT, RE, RET>  proteinInterpro_outNodes();

		// proteinReactomeTerm
		// outgoing
		public ProteinReactomeTerm<I, RV, RVT, RE, RET>   proteinReactomeTerm_out();
		public ReactomeTerm<I, RV, RVT, RE, RET>  proteinReactomeTerm_outNodes();

		// proteinKeyword
		// outgoing
		public ProteinKeyword<I, RV, RVT, RE, RET>   proteinKeyword_out();
		public Keyword<I, RV, RVT, RE, RET>  proteinKeyword_outNodes();

		// enzymaticActivity
		// outgoing
		public EnzymaticActivity<I, RV, RVT, RE, RET>   enzymaticActivity_out();
		public Enzyme<I, RV, RVT, RE, RET>   enzymaticActivity_outNodes();

		// uniref50Member
		// ingoing
		public UniRef50Member<I, RV, RVT, RE, RET>   uniref50Member_in();
		public UniRef50Cluster<I, RV, RVT, RE, RET>  uniref50Member_inNode();

		// uniref50Representant
		// ingoing
		public UniRef50Representant<I, RV, RVT, RE, RET>   uniref50Representant_in();
		public UniRef50Cluster<I, RV, RVT, RE, RET>  uniref50Representant_inNode();

		// uniref90Member
		// ingoing
		public UniRef90Member<I, RV, RVT, RE, RET>   uniref90Member_in();
		public UniRef90Cluster<I, RV, RVT, RE, RET>  uniref90Member_inNode();

		// uniref90Representant
		// ingoing
		public UniRef90Representant<I, RV, RVT, RE, RET>  uniref90Representant_in();
		public UniRef90Cluster<I, RV, RVT, RE, RET>  uniref90Representant_inNode();

		// uniref100Member
		// ingoing
		public UniRef100Member<I, RV, RVT, RE, RET>   uniref100Member_in();
		public UniRef100Cluster<I, RV, RVT, RE, RET>  uniref100Member_inNode();

		// uniref90Representant
		// ingoing
		public UniRef100Representant<I, RV, RVT, RE, RET> uniref100Representant_in();
		public UniRef100Cluster<I, RV, RVT, RE, RET> uniref100Representant_inNode();

		// proteinReference
		// outgoing
		public ProteinReference<I, RV, RVT, RE, RET> proteinReference_out();
		public Reference<I, RV, RVT, RE, RET> proteinReference_outNodes();

	}


	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Edge types

	public final class BookCityType
			extends
			UniprotEdgeType<
					Book<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.BookType,
					BookCity<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.BookCityType,
					City<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.CityType
					>
			implements
			TypedEdge.Type.OneToOne {

		protected BookCityType(RET raw) {
			super(UniprotGraph.this.Book(), raw, UniprotGraph.this.City());
		}

		@Override
		public BookCityType value() {
			return graph().BookCity();
		}

		@Override
		public BookCity<I, RV, RVT, RE, RET> from(RE edge) {
			return new BookCity<I, RV, RVT, RE, RET>(edge, this);
		}
	}

	public final class ProteinDatasetType
			extends
			UniprotEdgeType<
					Protein<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.ProteinType,
					ProteinDataset<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.ProteinDatasetType,
					Dataset<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.DatasetType
					>
			implements
			TypedEdge.Type.OneToOne {

		protected ProteinDatasetType(RET raw) {
			super(UniprotGraph.this.Protein(), raw, UniprotGraph.this.Dataset());
		}

		@Override
		public ProteinDatasetType value() {
			return graph().ProteinDataset();
		}

		@Override
		public ProteinDataset<I, RV, RVT, RE, RET> from(RE edge) {
			return new ProteinDataset<I, RV, RVT, RE, RET>(edge, this);
		}
	}


	////////////////////////////////////////////////////////////////////////////////////////////////////////
	// helper classes

	public abstract class UniprotVertexProperty<
			V extends UniprotVertex<V, VT, I, RV, RVT, RE, RET>,
			VT extends UniprotGraph<I, RV, RVT, RE, RET>.UniprotVertexType<V, VT>,
			P extends UniprotVertexProperty<V, VT, P, PV>,
			PV
			>
			implements
			Property<V, VT, P, PV, UniprotGraph<I, RV, RVT, RE, RET>, I, RV, RVT, RE, RET> {

		protected UniprotVertexProperty(VT type) {

			this.type = type;
		}

		private VT type;

		@Override
		public final VT elementType() {
			return type;
		}
	}

	public abstract static class UniprotVertex<
			V extends UniprotVertex<V, VT, I, RV, RVT, RE, RET>,
			VT extends UniprotGraph<I, RV, RVT, RE, RET>.UniprotVertexType<V, VT>,
			I extends UntypedGraph<RV, RVT, RE, RET>, RV, RVT, RE, RET
			>
			implements
			TypedVertex<V, VT, UniprotGraph<I, RV, RVT, RE, RET>, I, RV, RVT, RE, RET> {

		private RV vertex;
		private VT type;

		protected UniprotVertex(RV vertex, VT type) {

			this.vertex = vertex;
			this.type = type;
		}

		@Override
		public UniprotGraph<I, RV, RVT, RE, RET> graph() {
			return type().graph();
		}

		@Override
		public RV raw() {
			return this.vertex;
		}

		@Override
		public VT type() {
			return type;
		}
	}

	abstract class UniprotVertexType<
			V extends UniprotVertex<V, VT, I, RV, RVT, RE, RET>,
			VT extends UniprotGraph<I, RV, RVT, RE, RET>.UniprotVertexType<V, VT>
			>
			implements
			TypedVertex.Type<V, VT, UniprotGraph<I, RV, RVT, RE, RET>, I, RV, RVT, RE, RET> {

		private RVT raw;

		protected UniprotVertexType(RVT raw) {
			this.raw = raw;
		}

		@Override
		public final RVT raw() {
			return raw;
		}

		@Override
		public final UniprotGraph<I, RV, RVT, RE, RET> graph() {
			return UniprotGraph.this;
		}
	}

	public abstract static class UniprotEdge<
			S extends UniprotVertex<S, ST, I, RV, RVT, RE, RET>,
			ST extends UniprotGraph<I, RV, RVT, RE, RET>.UniprotVertexType<S, ST>,
			E extends UniprotEdge<S, ST, E, ET, T, TT, I, RV, RVT, RE, RET>,
			ET extends UniprotGraph<I, RV, RVT, RE, RET>.UniprotEdgeType<S, ST, E, ET, T, TT>,
			T extends UniprotVertex<T, TT, I, RV, RVT, RE, RET>,
			TT extends UniprotGraph<I, RV, RVT, RE, RET>.UniprotVertexType<T, TT>,
			I extends UntypedGraph<RV, RVT, RE, RET>, RV, RVT, RE, RET
			>
			implements
			TypedEdge<
					S, ST, UniprotGraph<I, RV, RVT, RE, RET>,
					E, ET, UniprotGraph<I, RV, RVT, RE, RET>, I, RV, RVT, RE, RET,
					T, TT, UniprotGraph<I, RV, RVT, RE, RET>
					> {

		private RE edge;
		private ET type;

		protected UniprotEdge(RE edge, ET type) {

			this.edge = edge;
			this.type = type;
		}

		@Override
		public UniprotGraph<I, RV, RVT, RE, RET> graph() {
			return type().graph();
		}

		@Override
		public RE raw() {
			return this.edge;
		}

		@Override
		public ET type() {
			return type;
		}
	}

	abstract class UniprotEdgeType<
			S extends UniprotVertex<S, ST, I, RV, RVT, RE, RET>,
			ST extends UniprotGraph<I, RV, RVT, RE, RET>.UniprotVertexType<S, ST>,
			E extends UniprotEdge<S, ST, E, ET, T, TT, I, RV, RVT, RE, RET>,
			ET extends UniprotGraph<I, RV, RVT, RE, RET>.UniprotEdgeType<S, ST, E, ET, T, TT>,
			T extends UniprotVertex<T, TT, I, RV, RVT, RE, RET>,
			TT extends UniprotGraph<I, RV, RVT, RE, RET>.UniprotVertexType<T, TT>
			>
			implements
			TypedEdge.Type<
					S, ST, UniprotGraph<I, RV, RVT, RE, RET>,
					E, ET, UniprotGraph<I, RV, RVT, RE, RET>, I, RV, RVT, RE, RET,
					T, TT, UniprotGraph<I, RV, RVT, RE, RET>
					> {

		private RET raw;
		private ST srcT;
		private TT tgtT;

		protected UniprotEdgeType(ST srcT, RET raw, TT tgtT) {

			this.raw = raw;
			this.srcT = srcT;
			this.tgtT = tgtT;
		}

		@Override
		public final ST sourceType() {
			return srcT;
		}

		@Override
		public final TT targetType() {
			return tgtT;
		}

		@Override
		public final RET raw() {
			return raw;
		}

		@Override
		public final UniprotGraph<I, RV, RVT, RE, RET> graph() {
			return UniprotGraph.this;
		}
	}


}